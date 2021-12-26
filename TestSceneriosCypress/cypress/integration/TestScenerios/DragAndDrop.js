///<reference types ="cypress"/>

import '@4tw/cypress-drag-drop'


describe('DradAndDrop' , ()=>{




  beforeEach('BEFORE METHOD' , ()=>{


     cy.visit('https://jqueryui.com/droppable/');
     cy.get(".demo-frame").click;
     


  }) 


  // it('Drag & Drop' , ()=>{

  //   cy.wait(1000);
  //   cy.get('#draggable').drag('#droppable');

   

  // })

  it('Drag & Drop' , ()=>{
    const dataTransfer = new DataTransfer;

    cy.wait(1000);
    cy.get('#draggable').trigger('drag',{dataTransfer});
    cy.get('#droppable').trigger('drop',{dataTransfer});
   

  })


})