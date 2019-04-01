<#import "/spring.ftl" as spring>
<html>
<h1>My modules</h1>
<ul>
<#list modules as module>
    <li>${module}</li>
</#list>
</ul>
<br>
<a href="/logout">Logout</a>
</html>