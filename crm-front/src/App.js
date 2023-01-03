import { BrowserRouter, Routes, Route } from "react-router-dom";
import Home from "./Home";
import NewDeal from "./Components/NewDeal/NewDeal";

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Home />} forceRefresh={true} />
        <Route path="/newdeal" element={<NewDeal />} forceRefresh={true} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;