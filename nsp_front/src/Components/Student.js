import React,{Component} from "react";
import StudentService from '../ServiceLayer/StudentService';


export default class Student extends Component{

    state = {
        students: []
      }


   
 render(){
     

     return(

           <>

           <h2>Students</h2>
           {this.state.students.map((students, index)=>(
                <div key={index}>
                   <ul>
                      <li>{students.studentId}</li>

                       <li>{students.studentName}</li>
                   </ul>


                    
                </div>
            ))}     







           </>

     );


 }

componentDidMount(){

    StudentService.getStudentList().then((res) => {
        this.setState({ students: res.data});
    });
}

}

