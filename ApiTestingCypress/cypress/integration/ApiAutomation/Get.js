describe('HTTP API',()=>{

 it('GET',()=>{

     cy.request({
           method :'GET',
           url    : 'http://localhost:8080/Student/list'

     }).then(function(response){
         expect(200).to.equals(response.status);
     })


 })



})