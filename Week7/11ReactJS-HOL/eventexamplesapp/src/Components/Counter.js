import React, { Component } from 'react';

class Counter extends Component {
  constructor() {
    super();
    this.state = {
      count: 0
    };
  }

  increment = () => {
    this.setState({ count: this.state.count + 1 });
  };

  decrement = () => {
    this.setState({ count: this.state.count - 1 });
  };
  sayHello = () => {
    alert(`Hello ${this.state.count}`);
  };
  incAndGreet = () => {
    this.increment();
    this.sayHello();
  };
  sayWelcome = (msg) => {
    alert(msg);
  };

  handleClick = (e) => {
    alert("I was clicked");
  };

  render() {
    return (
      <div>
        <h2>Counter: {this.state.count}</h2>
        <button onClick={this.increment}>Increment</button>
        <button onClick={this.decrement}>Decrement</button>
        <button onClick={this.incAndGreet}>Increase</button>
        <br /><br />
        <button onClick={() => this.sayWelcome("welcome!")}>Say Welcome</button>
        <br /><br />
        <button onClick={this.handleClick}>Click on me</button>
      </div>
    );
  }
}

export default Counter;