import styles from "./ActivityList.module.css";
import ActivityItem from "./ActivityItem/ActivityItem";
function ActivityList(data) {
  const activityData = data;

  return (
    <div className={styles.wrapper}>
      <div className={styles.content}>
        {activityData && activityData.listActivities &&
          activityData.listActivities.map((activity) => {
            return <ActivityItem data={activity} />;
          })}
      </div>
      <div className={styles.newButton}> + NEW ACTIVITY </div>
    </div>
  );
}

export default ActivityList;
