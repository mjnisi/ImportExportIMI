<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Article 56 !</title>
</head>
<body>


<#list article56List.edpbDemoArticle56List as art56>
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


<table>
    <tr><td>Number:	    <td>${art56.number!}
    <tr><td>Broadcast Date:	    <td>${art56.broadcastDate!}
	<tr><td><u>Proposed Deadline:
	<tr><td>Reply Date:	    <td>${art56.proposedDeadline.replyDate!}
	<tr><td><u>Case Type:
	<tr><td>Is Local?	    <td>${art56.caseType.isLocalCase.description!}
	<tr><td>Local Case Additional Info	    <td>${art56.caseType.localCaseAdditionalInfo.description!}

	<tr><td><u>Case Background:
	<tr><td>Case File Title:	    <td>${art56.caseBackground.caseFileTitle!}
	<tr><td>Case National Reference Number:	    <td>${art56.caseBackground.caseNationalReferenceNumber!}
	<tr><td>Case Processing Description:	    <td>${art56.caseBackground.caseProcessingDescription!}
	<tr><td>Case Origin:	    <td>${art56.caseBackground.caseOrigin.description!}
	<tr><td>Case Kind Of Decision:	    <td>
	<#list art56.caseBackground.caseKindOfDecision as ckd>
	<tr><td>	    <td>${ckd.description!}
	</#list>
	<tr><td>Case Kind Of Decision Other:	    <td>${art56.caseBackground.caseKindOfDecisionOther!}
	<tr><td>Case Topic:	    <td>${art56.caseBackground.caseTopic.description!}
	<tr><td>Case Topic Other:	    <td>${art56.caseBackground.caseTopicOther!}
	<tr><td>Case Legal Reference:	    <td>
	<#list art56.caseBackground.caseLegalReference as caseLegalReference>
	<tr><td>	    <td>${caseLegalReference.description!}
	</#list>
	
	<tr><td>Case Legal Reference Other:	    <td>${art56.caseBackground.caseLegalReferenceOther!}
	<tr><td>Case Security Requirements:	    <td>${art56.caseBackground.caseSecurityRequirements!}
	<tr><td>Case Description:	    <td>${art56.caseBackground.caseDescription!}
	<tr><td>Case Description With Personal Data:	    <td>${art56.caseBackground.caseDescriptionWithPersonalData!}

	<tr><td><u>Assumed CSA List:	    <td>
	<#list art56.assumedCSAOnetomanyList.assumedCSAOnetomanyList as assumedCSAOnetomanyList>
	<tr><td>CSA KnownUnknown:	    <td>${assumedCSAOnetomanyList.csaKnownUnknown.description!}
	<tr><td>CSA Name:	    <td><b>${assumedCSAOnetomanyList.csaName.description!}</b>
	<tr><td>CSA Motivation	    <td>${assumedCSAOnetomanyList.csaMotivation.description!}
	<tr><td>CSA AdditionalCom	    <td>${assumedCSAOnetomanyList.csaAdditionalCom!}
	</#list>


</table>
      
         
<br>
</#list>

</body>
</html>