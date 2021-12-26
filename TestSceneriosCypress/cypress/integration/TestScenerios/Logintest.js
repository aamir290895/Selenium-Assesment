describe('Login-test' , ()=>{

beforeEach('BEFORE METHOD' , ()=>{


 cy.visit('https://adept-stage-306721.web.app/');
        
   
   
}) 
   

it('login',()=>{

cy.get('#email').type('admin@shahdol.com');
cy.get('#password').type('123456');
cy.get('#btn-next').click();

})


})