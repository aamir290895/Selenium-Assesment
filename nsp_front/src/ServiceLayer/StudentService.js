
import axios from 'axios';

    

 const STUDENT_API_URL ="http://localhost:8080/Student";
 class StudentService {
  
    getStudentList(){
        return axios.get(STUDENT_API_URL + '/list' );
    }

    createStudent(){
        return axios.post(STUDENT_API_URL + '/add');
    }

    getStudentById(id){
        return axios.get(STUDENT_API_URL +  '/get/' +id);
    }

   

}
export default new  StudentService();