import React from 'react';
import './App.css';
import officeImage from './image.png'; 

function App() {
  const pageHeading = "Office Space";

  const officeImageSrc = officeImage;

  const singleOffice = {
    name: "DBS",
    rent: 50000,
    address: "Chennai"
  };

const officeList = [
  { id: 1, name: "Skyline Plaza", rent: 82000, address: "Mumbai" },
  { id: 2, name: "GreenTech Space", rent: 52000, address: "Chennai" },
  { id: 3, name: "Vertex Center", rent: 67000, address: "Kolkata" },
  { id: 4, name: "NextGen Hub", rent: 61000, address: "Ahmedabad" }
];


  return (
    <div className="App">
      <h1>{pageHeading} , at Affordable Range</h1>
      <img
        src={officeImageSrc} 
        alt="Office Space"
        style={{ width: '100px', height: '100px', marginBottom: '20px' }}
      />

      <div>
        <h2>Name: {singleOffice.name}</h2>
        <h3 style={{ color: singleOffice.rent <= 60000 ? 'red' : 'green' }}>
          Rent: Rs. {singleOffice.rent}
        </h3>
        <h3>Address: {singleOffice.address}</h3>
      </div>
      <hr style={{ margin: '40px 0' }} />
      <h2>Some More Office Spaces:</h2>
      {officeList.map(office => (
        <div key={office.id} style={{ border: '1px solid #ccc', margin: '15px auto', padding: '10px', maxWidth: '500px' }}>
          <h3>Name: {office.name}</h3>
          <h4 style={{ color: office.rent <= 60000 ? 'red' : 'green' }}>
            Rent: Rs. {office.rent}
          </h4>
          <h4>Address: {office.address}</h4>
        </div>
      ))}
    </div>
  );
}

export default App;