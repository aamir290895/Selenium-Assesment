
describe('login-fb', () => {


    

it('login',()=>{
    const newItem = 'aamir.007sdl@gmail.com';
    const pswd = 'ghasgb';
    cy.visit('www.facebook.com/');

    cy.wait(1000);
    cy.get('input#email').type(`${newItem}`);
    cy.get('input#pass').type(`${pswd}`);
    cy.wait(500);
    cy.get("[name='login']").click();
    cy.wait(1000);
})

 

})