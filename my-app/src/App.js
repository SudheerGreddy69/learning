

import React from 'react';
import axios from 'axios';


class App extends React.Component {

  state = {
    id: '',
    employeeName : '',
    emp : []
  }

  handleIdChange = event => {
    this.setState({ id: event.target.value });
    console.log("id",this.state.id);
  }
  handleNameChange =event => {
    this.setState({ employeeName: event.target.value });
    console.log("name",this.state.employeeName);
  }

   //put api
   handleUpdate = event => {
    axios.put("http://localhost:8080/updateEmployee",{
      "employeeId": this.state.id,
      "employeeName": this.state.employeeName
    }).then(res=>{
      axios.get(`http://localhost:8080/getEmployees`)
              .then(res => {
              const employee = res.data;
              this.setState({emp:  employee });
            })          
    })  
  }


  //Delete Api
  handleDelete = event => {
    event.preventDefault();
    axios.delete(`http://localhost:8080/deleteEmployee/${this.state.id}`).then((res)=>{
          console.log(res);
            axios.get(`http://localhost:8080/getEmployees`)
            .then(res => {
            const employee = res.data;
            this.setState({emp:  employee });
          })
      })                
      .catch((err)=>{
        console.log(err)
      })
      this.state.id=""
    }    
   

 //Post api
 handleAdd = event => {
  axios.post("http://localhost:8080/employee",{
    "employeeId": this.state.id,
    "employeeName": this.state.employeeName

  }).then(res=>{
    //console.log(this.state.id)
    axios.get(`http://localhost:8080/getEmployees`)
            .then(res => {
            const employee = res.data;
            this.setState({emp:  employee });
          })          
  })  
}


  componentDidMount() {
    //get method
    axios.get("http://localhost:8080/getEmployees").then((res)=>{

        console.log(res.data);
        const employee = res.data;
        this.setState({emp : employee})

    })
 
  }

  render() {
    return (
      <div>
        <ul>
        { this.state.emp.map((d,i) =>
         <li>id : {d.employeeId} empname : {d.employeeName}</li>)
        }
      </ul>      
        


         <label>
            Emp ID :
            <input type="text"  name="id" onChange={this.handleIdChange} />
            
            <br></br>

            Emp Name :
            <input type="text" name="employeeName" onChange ={this.handleNameChange}/>
          </label>
          
          <br></br>


          <button onClick={this.handleAdd}>Add</button> 

          <button onClick={this.handleUpdate}>Update</button>

          <button onClick={this.handleDelete}>Delete</button>
      </div>
    )
  }




}

export default App;
