user_name=Shalini
  
echo "Hi $user_name, Welcome to Zemosotechnologies pvt.ltd. We and the rest of the management are glad to have you on board"
x=1
expr $x + 345  #346 
expr "MY_MESSAGE: $MY_MESSAGE"

MY_MESSAGE="Hello World"
MY_SHORT_MESSAGE=hi
MY_NUMBER=1
MY_PI=3.142
MY_OTHER_PI="3.142"
MY_MIXED=123abc

echo What is your name?
read MY_NAME #read command gives runtime value
echo "Hello $MY_NAME - hope you're well."

echo "MYVAR is: $MYVAR"
MYVAR="hi there"
echo "MYVAR is: $MYVAR"

echo "What is your name?"
read USER_NAME1
echo "Hello ${USER_NAME1}"
# echo "Hello ${USER_NAME}"

echo "I will create you a file called ${USER_NAME1}_file"
touch "${USER_NAME1}_file"


