<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Article 56 !</title>
</head>
<body>


<#list article56List.edpbDemoArticle56List as art56>
--------------------------------------------------
<table>
    <tr><td>Number:	    <td>${art56.number}
    <tr><td>Broadcast Date:	    <td>${art56.broadcastDate}
	<tr><td>Proposed Deadline:
	<tr><td>Reply Date:	    <td>${art56.proposedDeadline.replyDate}
	<tr><td>Case Type:
	<tr><td>Is Local?	    <td>${art56.caseType.isLocalCase.id}
	<tr><td>Local Case Additional Info	    <td>${art56.caseType.localCaseAdditionalInfo.id}
</table>
 
<br>
</#list>

</body>
</html>