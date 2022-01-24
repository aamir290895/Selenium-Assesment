import time

import pytest
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.select import Select

from Pages.Base import BasePage
from selenium import webdriver
from webdriver_manager.chrome import ChromeDriverManager

from Pages.login import Login
from config.Locators import Locators
from config.TestData import TestData


class TestCases():
    driver = webdriver.Chrome(ChromeDriverManager().install())
    login_cls = Login(driver)
    testdata = TestData()

    site = login_cls.visit_url(testdata.URL)

    base = BasePage(driver)
    locators = Locators()

    def test_case_buy_product(self):
        self.login_cls.login_details(self.testdata.USER_NAME,self.testdata.PASSWORD)
        time.sleep(3)
        self.search_bar = self.login_cls.get_element(self.locators.SEARCH)
        self.search_bar.send_keys(self.testdata.PRODUCT, Keys.ENTER)
        time.sleep(3)
        self.login_cls.just_click(self.locators.IPHONE_LOCATOR)
        handles = self.driver.window_handles
        for handle in handles:
            if handle != self.driver.current_window_handle:
                self.driver.switch_to.window(handle)
                self.login_cls.just_click(self.locators.BUY_NOW)
                time.sleep(2)
                break
        time.sleep(2)
        self.login_cls.just_click(self.locators.ADD_NEW_ADDRESS_LOCATOR)
        self.login_cls.do_send_keys(self.locators.NAME_LOCATOR,self.testdata.NAME)
        self.login_cls.do_send_keys(self.locators.PHONE_LOCATOR,self.testdata.PHONE)
        self.login_cls.do_send_keys(self.locators.PINCODE_LOCATOR,self.testdata.PINCODE)
        self.login_cls.do_send_keys(self.locators.LOCALITY_LOCATOR,self.testdata.LOCALITY)
        self.login_cls.do_send_keys(self.locators.ADDRESS_LOCATOR,self.testdata.ADDRESS)
        select_element = self.login_cls.get_element(self.locators.STATE_LOCATOR)
        select_object = Select(select_element)
        select_object.select_by_visible_text(self.testdata.STATE)
        self.login_cls.just_click(self.locators.DELIVERY_TIME_LOCATOR)
        self.login_cls.just_click(self.locators.PLACE_ORDER_LOCATOR)





