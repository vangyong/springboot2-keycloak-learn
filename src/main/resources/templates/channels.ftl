<#import "/spring.ftl" as spring>
<html>
<h1>My channels</h1>
<ul>
<#list channels as channel>
    <li>${channel}</li>
</#list>
</ul>
<br>
<a href="/logout">Logout</a>
</html>