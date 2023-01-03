import { useState } from "react";

import DealItem from "./DealItem/DealItem";
import styles from "./DealList.module.css";

function DealList({ title, data, setDealSelected }) {
  const dealsList = data;
  const [currentDeal, setCurrentDeal] = useState();

  function changeDealSelected(data) {
    setCurrentDeal(data);
    setDealSelected(currentDeal);
  }

  return (
    <div className={styles.wrapper}>
      <div className={styles.header}>{title}</div>
      <div className={styles.content}>
        {dealsList &&
          dealsList.map((deal) => {
            return (
              <DealItem data={deal} changeDealSelected={changeDealSelected} />
            );
          })}
      </div>
    </div>
  );
}
export default DealList;
