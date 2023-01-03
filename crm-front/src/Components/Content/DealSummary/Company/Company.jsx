import styles from "./Company.module.css";

function Company(data) {
  return (
    <>
      <div className={styles.globalWrapper}>
        <div>
          <div className={styles.title}>Company</div>
          <div className={styles.wrapper}>
            <div>
              <div className={styles.info}>
                <p>
                  <b>Name</b>: {data.name}
                </p>
                <p>
                  <b>Web</b>: {data.web}
                </p>
                <p>
                  <b>Address</b>: {data.address}
                </p>
                <p>
                  <b>Sector</b>: {data.sector}
                </p>
              </div>
            </div>
          </div>
        </div>
        <img
          className={styles.profile_pic}
          src="https://media.glassdoor.com/sqll/42515/solera-squareLogo-1641391060257.png"
          alt="Logo company"
        />
      </div>
    </>
  );
}

export default Company;
