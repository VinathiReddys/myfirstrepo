//a[@id='nav-cart']


@beforemethod
@test
@Aftermethod


@DataProvider(name = "datas")
public Object[][] getData(){
return new Object[][]{
{"user", "pass"}
{"user1", "pass1"}};
}

@Test(dataProvider = "datas")
public void test(String name, String pass){
}
