
from Pages.Base import BasePage
from config.TestData import TestData
from config.Locators import Locators


class Login(BasePage):
    use_locator = Locators()
    use_keys = TestData()
    def login_details(self,username ,password):
        self.just_click(self.use_locator.POPUP)
        self.just_click(self.use_locator.LOGIN)
        self.do_send_keys( self.use_locator.USER_NAME_LOCATOR, username)
        self.do_send_keys( self.use_locator.PASSWORD_LOCATOR, password)
        self.just_click(self.use_locator.LOGIN_BUTTON_LOCATOR)