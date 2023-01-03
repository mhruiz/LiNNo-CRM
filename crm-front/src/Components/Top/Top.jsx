import styles from "./Top.module.css";
import { useNavigate } from "react-router-dom";

function Top() {
  const navigate = useNavigate();

  const navigateNewDeal = () => {
    navigate("/newdeal");
  };

  return (
    <div className={styles.top}>
      <h2>Deals</h2>
      <div className={styles.newButton} onClick={navigateNewDeal}>
        NEW
      </div>
    </div>
  );
}
export default Top;
