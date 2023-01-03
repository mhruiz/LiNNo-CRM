import styles from "./ActivityItem.module.css";

function ActivityItem({ data }) {
  return (
    <div className={styles.wrapper}>
      <p>
        <b>Email:</b> {data.email}
      </p>
      <p>
        <b>Date:</b> {data.date}
      </p>
      <p className={styles.info}>{data.subject}</p>
      {/* <p>Creation date: {data.createDate.split("T")[0]}</p>
        <p>Last update: {data.lastUpdate.split("T")[0]}</p> */}
      {/* <p>Contact: {data.pointContact.name} {data.contact.surname}</p> */}
    </div>
  );
}
export default ActivityItem;
