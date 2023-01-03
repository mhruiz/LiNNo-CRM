import styles from "./Contact.module.css";

function Contact(data) {
  return (
    <>
      <div className={styles.title}>Contact</div>
      <div className={styles.wrapper}>
        <img
          className={styles.profile_pic}
          src={data.description}
          alt="Profile"
        />
        <div>
          <div className={styles.info}>
            <p>
              <b>Name</b>: {data.name}
            </p>
            <p>
              <b>Last Name</b>: {data.lastName}
            </p>
            <p>
              <b>Phone Number</b>: {data.phoneNumber}
            </p>
            <p>
              <b>Email</b>: {data.email}
            </p>
          </div>
        </div>
      </div>
    </>
  );
}

export default Contact;
