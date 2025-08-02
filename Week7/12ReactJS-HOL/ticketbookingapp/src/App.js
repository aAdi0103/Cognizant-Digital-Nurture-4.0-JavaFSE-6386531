import React, { useState } from "react";
import UserPage from "./UserPage";
import GuestPage from "./GuestPage";
import "./App.css";

function LoginButton(props) {
  return (
    <button onClick={props.onClick}>Login</button>
  );
}

function LogoutButton(props) {
  return (
    <button onClick={props.onClick}>Logout</button>
  );
}

function App() {
  const [login, setlogin] = useState(false);
  const handleLogin= () => {
    setlogin(true);
  };

  const handleLogout = () => {
    setlogin(false);
  };

  let button;
  let page;
  if (login) {
    button = <LogoutButton onClick={handleLogout} />;
    page=<UserPage/>;
  } else {
    button =<LoginButton onClick={handleLogin} />;
    page=<GuestPage/>;
  }

  return (
    <div className="App">
      <header className="App-header">
        {page}
        {button}
      </header>
    </div>
  );
}

export default App;