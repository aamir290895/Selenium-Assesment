class Base {

    visit() {
        cy.visit("www.facebook.com");
    }

    email(value) {
        
        const em = cy.get('#email');
        em.type(value);
        return this;
    }

    password(value) {
        
        const pass = cy.get('#pass');
        pass.type(value);
        return this;
    }

    submit() {
        const btn = cy.get('');
        btn.click();
    }
}
export default Base;