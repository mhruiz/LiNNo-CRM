import styles from "./DealItem.module.css";

function DealItem({ data, changeDealSelected }) {
  return (
    <div className={styles.wrapper} onClick={() => changeDealSelected(data)}>
      <p className={styles.title}>{data.title}</p>
      <p>Creation date: {data.createDate.split("T")[0]}</p>
      <p>Last update: {data.lastUpdate.split("T")[0]}</p>
    </div>
  );
}
export default DealItem;
