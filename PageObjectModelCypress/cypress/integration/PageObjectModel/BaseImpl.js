import { describe } from "mocha";
import Base from "./Base";
/// <reference types="cypress"/>

describe('test-suit', () => {
    
    it('login', () => {
     
        const lg = new Base();
        lg.email("aaaaa");
        lg.password("sdsadas");
        lg.submit();

 })

})