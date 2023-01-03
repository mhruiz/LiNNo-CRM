import { useEffect, useState } from "react";
import DealList from "./DealList/DealList";
import styles from "./Content.module.css";
import DealSummary from "./DealSummary/DealSummary";

function Content() {
  const [dealsData, setDealsData] = useState();
  const [dealSelected, setDealSelected] = useState();

  useEffect(() => {
    fetch("http://localhost:8081/api/deal")
      .then((response) => response.json())
      .then((data) => setDealsData(data));
  }, []);

  const filterByStatus = (data, status) => {
    return data?.filter((element) => element.currentState == status);
  };

  return (
    <div className={styles.content}>
      <div className={styles.dealListWrapper}>
        <DealList
          title="LEAD"
          data={filterByStatus(dealsData, "LEAD")}
          setDealSelected={setDealSelected}
        />
        <DealList
          title="NEGOTIATION"
          data={filterByStatus(dealsData, "NEGOTIATION")}
          setDealSelected={setDealSelected}
        />
        <DealList
          title="CLOSED"
          data={filterByStatus(dealsData, "CLOSED")}
          setDealSelected={setDealSelected}
        />
        <DealList
          title="LOST"
          data={filterByStatus(dealsData, "LOST")}
          setDealSelected={setDealSelected}
        />
      </div>
      <div style={{ width: "30%" }}>
        <DealSummary data={dealSelected} />
      </div>
    </div>
  );
}
export default Content;
