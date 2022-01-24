from selenium.webdriver.chrome import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.wait import WebDriverWait
from webdriver_manager.chrome import ChromeDriverManager


class BasePage():
    def __init__(self,driver):
        self.driver = driver

    def visit_url(self,url):
        self.driver.get(url)

    def just_click(self,by_locator):

        WebDriverWait(self.driver,10).until(lambda d: d.find_element(By.XPATH,by_locator)).click()

    def do_send_keys(self,by_locator,keys):
        WebDriverWait(self.driver,10).until(lambda d : d.find_element(By.XPATH,by_locator)).send_keys(keys)

    def get_element(self,by_locator):
        element = WebDriverWait(self.driver,10).until(lambda d : d.find_element(By.XPATH,by_locator))
        return element
    def window_switch(self):
        handles = self.driver.window_handles
        for handle in handles:
            if handle != self.driver.current_window_handle:
                self.driver.switch_to.window(handle)
            break
