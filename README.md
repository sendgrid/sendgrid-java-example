# sendgrid-java-example

This is an example of using the [SendGrid Java library](https://github.com/sendgrid/sendgrid-java).

## Usage

```bash
git clone http://github.com/scottmotte/sendgrid-java-example.git
cd sendgrid-java-example
gradle build # this might be optional
export TO=your@email.com SENDGRID_USERNAME=your_username SENDGRID_PASSWORD=your_password
java -cp repo/com/github/scottmotte/0.0.1/scottmotte-0.0.1-jar.jar com.github.scottmotte.SendGridJavaExample
```

You should get a `{"message":"success"}` response back if your credentials were correct.
