import time

import pytest
from selenium.webdriver.common.keys import Keys

from Pages.Base import BasePage
from selenium import webdriver
from webdriver_manager.chrome import ChromeDriverManager

from Pages.login import Login
from config.Locators import Locators


class TestCases():
    driver = webdriver.Chrome(ChromeDriverManager().install())

    login_cls = Login(driver)
    base = BasePage(driver)
    locators = Locators()

    @pytest.mark.one
    def test_case_login(self):
        self.login_cls.visit_url("https://www.flipkart.com")
        self.login_cls.login_details("9340952682","demopass")

    @pytest.mark.two
    def search_product(self):
        search_bar =self.base.get_element(self.locators.SEARCH)
        search_bar.send_keys("i phone 13" , Keys.ENTER)

    # @pytest.fixture
    # def init_driver(request):
    #     wb_driver = webdriver.Chrome(ChromeDriverManager().install())
    #     request.cls.driver = wb_driver
    #     yield
    #     wb_driver.close()