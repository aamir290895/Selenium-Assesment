describe('HTTP API',()=>{

 it('UPDATE-API-TEST',()=>{

     cy.request({
           method :'PUT',
           url: 'http://localhost:8080/Student/update/5',
           body: {
               'name'   : 'MOHAMMAD AAMIR KHAN',
               'gender' : 'male',
               'state'  : 'madhya pradesh',
          },
        

     }).then((response)=>{
         expect(200).to.equal(response.status);
     })


 })



})