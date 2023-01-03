import styles from "./DealSummary.module.css";
import Contact from "./Contact/Contact";
import Company from "./Company/Company";
import ActivityList from "./ActivityList/ActivityList";

function DealSummary(data) {
  let contact;
  let buttonContact;
  if (data.data && data.data.pointContact) {
    contact = <Contact {...data.data.pointContact} />;
    buttonContact = <div className={styles.editButton}> Edit </div>;
  } else {
    contact = <></>;
    buttonContact = <div className={styles.newButton}> + NEW CONTACT </div>;
  }

  let company;
  let buttonCompany;
  if (data.data && data.data.company) {
    company = <Company {...data.data.company} />;
    buttonCompany = <div className={styles.editButton}> Edit </div>;
  } else {
    company = <></>;
    buttonCompany = <div className={styles.newButton}> + NEW COMPANY </div>;
  }

  let activities;
  if (data.data) {
    activities = <ActivityList {...data.data} />;
  } else {
    activities = <></>;
  }

  // const company = {
  //   // name: "Solera",
  //   // web: "www.solera.com",
  //   // address: "Avenida Palmeras 19B, Sevilla",
  //   // sector: "Software",
  // };

  return (
    <>
      <div className={styles.wrapper}>
        <div className={styles.title}>Deal Summary</div>
        <div className={styles.contact_content}>{contact}</div>
        {buttonContact}
      </div>
      <div className={styles.wrapper}>
        <div className={styles.company_content}>{company}</div>
        {buttonCompany}
      </div>
      <div className={styles.otherTitle}>Activities</div>
      <div className={styles.wrapper}>{activities}</div>
    </>
  );
}

export default DealSummary;
