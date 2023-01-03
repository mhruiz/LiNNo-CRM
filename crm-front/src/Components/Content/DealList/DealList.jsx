import { useState } from "react";

import DealItem from "./DealItem/DealItem";
import styles from "./DealList.module.css";

function DealList({ title, data, setDealSelected }) {
  const dealsList = data;

  return (
    <div className={styles.wrapper}>
      <div className={styles.header}>{title}</div>
      <div className={styles.content}>
        {dealsList &&
          dealsList.map((deal) => {
            return (
              <DealItem data={deal} changeDealSelected={setDealSelected} />
            );
          })}
      </div>
    </div>
  );
}
export default DealList;
