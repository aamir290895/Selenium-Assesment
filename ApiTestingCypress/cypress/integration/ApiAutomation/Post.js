describe('HTTP API',()=>{

 it('POST-API-TEST',()=>{

     cy.request({
           method :'POST',
           url: 'http://localhost:8080/Student/add',
           body: {
               'name': 'aamir',
               'gender' : 'male',
               'state' : 'madhya pradesh',
          },
          headers: {
               'Content-Type' : 'application/json'
           }

     }).then(function(response){
         expect(200).to.equal(response.status);
     })


 })



})