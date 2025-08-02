import React from "react";

function UserPage() {
  return (
    <div>
      <h1>Welcome Back!!!</h1>
      <h1>You can book your tickets now</h1>
      <button onClick={() => alert("Ticket booked successfully!")}>
        Book Ticket
      </button>
    </div>
  );
}

export default UserPage;