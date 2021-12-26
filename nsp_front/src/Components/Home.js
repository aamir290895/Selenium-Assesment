import React,{Component} from "react";
import 'bootstrap/dist/css/bootstrap.min.css';
import {Link} from 'react-router-dom'


export default class Home extends Component {


    render(){
          

        return(
               <>
                   <div class="container">
                       <div class="row">
                          <div class="col">
                          </div>
                          <div class="col-6">
                          </div>
                          <div class="col">
                           <div className="front_login">
                           <form>
                             <div class="mb-3">
                               <label for="exampleInputEmail1" class="form-label">Student Registration Id</label>
                                 <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"></input>
                               </div>
                            <div class="mb-3">
                               <label for="exampleInputPassword1" class="form-label">Password</label>
                                  <input type="password" class="form-control" id="exampleInputPassword1"></input>
                            </div>
                              <div class="mb-3 form-check">
                                  <input type="checkbox" class="form-check-input" id="exampleCheck1"></input>
                                <label class="form-check-label" for="exampleCheck1">Remember Password</label>
                              </div>
                            <button type="submit" class="btn btn-primary">Login</button>
                            </form>
                            </div>   
                          </div>
                    </div>

                </div>


               </>

             );


      }

}