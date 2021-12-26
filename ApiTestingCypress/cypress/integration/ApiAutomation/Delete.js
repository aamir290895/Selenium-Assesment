describe('HTTP API',()=>{

 it('DELETE-API-TEST',()=>{

     cy.request({
           method :'DELETE',
           url: 'http://localhost:8080/Student/delete/2',
          
          headers: {
               'Content-Type' : 'application/json'
           }

     }).then(function(response){
         expect(200).to.equal(response.status);
     })


 })



})