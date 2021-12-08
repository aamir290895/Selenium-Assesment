describe('MyTest',()=>{
    
it ('login',()=>{
    const newItem = 'aamir.007sdl@gmail.com';
    const pswd = 'ghasgb';

    cy.visit('https://www.facebook.com/');
    cy.wait(1000);
    cy.get('#email').type(`${newItem}`);
    cy.get('#pass').type(`${pswd}`);
    cy.wait(1000);
    cy.get('#loginbutton').click();

})



})