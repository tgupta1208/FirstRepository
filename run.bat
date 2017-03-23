cd F:\Framework1\ActTimeFrameWork
set ProjectPath=F:\Framework1\ActTimeFrameWork
echo %ProjectPath%
set classpath=%ProjectPath%\bin;%ProjectPath%\lib\*
echo %classpath%
java org.testng.TestNG %ProjectPath%\testng.xml