<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Article 56 !</title>
</head>
<body>

<style type="text/css">
table.tg {
  border: 2px solid #FFFFFF;
  width: 100%;
  text-align: center;
  border-collapse: collapse;
}
table.tg td, table.tg th {
  border: 1px solid #FFFFFF;
  padding: 3px 4px;
}
table.tg tbody td {
  font-size: 13px;
}
table.tg tr:nth-child(even) {
  background: #f8f6ff;
}
table.tg thead {
  background: #FFFFFF;
  ##border-bottom: 4px solid #333333;
  ##border-top: 4px solid #333333;

}
table.tg thead th {
  font-size: 15px;
  color: #fff;
  text-align: center;
  border-left: 2px solid #fff;
}
table.tg thead th:first-child {
  border-left: none;
}

table.tg .tg-e4wc { 
	background-color: #6c7ae0;
	border-color:#fff;
	font-size:15px;
	position:-webkit-sticky;
	position:sticky;
	text-align:center;
  	top:-1px;
  	vertical-align: middle;
  	will-change:transform	
  }
  
table.tg .tg-sort-header::-moz-selection{background:0 0}
table.tg .tg-sort-header::selection{background:0 0}.tg-sort-header{cursor:pointer}
table.tg .tg-sort-header:after{content:'';float:right;margin-top:7px;border-width:0 5px 5px;border-style:solid;
  border-color:#fff transparent;visibility:hidden}
table.tg .tg-sort-header:hover:after{visibility:visible}
table.tg .tg-sort-asc:after,.tg-sort-asc:hover:after,.tg-sort-desc:after{visibility:visible;opacity:.4}
table.tg .tg-sort-desc:after{border-bottom:none;border-width:5px 5px 0}@media screen and (max-width: 767px) {.tg {width: auto !important;}.tg col {width: auto !important;}
.tg-wrap {
	overflow-x: auto;
	-webkit-overflow-scrolling: touch;
	margin: auto 0px;
	align-items: center;
    justify-content: center;
    flex-wrap: wrap;
    }
}

</style>
<div class="tg-wrap">
<table id="tg-uhlt6" class="tg">
<thead>
  <tr>
    <th class="tg-e4wc">Number</th>
    <th class="tg-e4wc">Broadcast Date</th>
    <th class="tg-e4wc">Reply Date</th>
    <th class="tg-e4wc">Is Local</th>
    <th class="tg-e4wc">Local Case Additional Info</th>
    <th class="tg-e4wc">File Title</th>
    <th class="tg-e4wc">National Reference Number</th>
    <th class="tg-e4wc">Processing Description</th>
    <th class="tg-e4wc">Origin</th>
    <th class="tg-e4wc">Kind Of Decision</th>
    <th class="tg-e4wc">Kind Of Decision Other</th>
    <th class="tg-e4wc">Topic</th>
    <th class="tg-e4wc">Topic Other</th>
    <th class="tg-e4wc">Legal Reference</th>
    <th class="tg-e4wc">Legal Reference Other</th>
    <th class="tg-e4wc">Security Requirements</th>
    <th class="tg-e4wc">Description</th>
    <th class="tg-e4wc">Description With Personal Data</th>
    <th class="tg-e4wc">Assumed CSA List</th>
  </tr>
</thead>
<tbody>
<#list article56List.edpbDemoArticle56List as art56>

    <tr>
    <td class="tg-0lax">${art56.number!}</td>
    <td class="tg-0lax">${art56.broadcastDate!}</td>
    <td class="tg-0lax">${art56.proposedDeadline.replyDate!}</td>
    <td class="tg-0lax">${art56.caseType.isLocalCase.description!}</td>
    

    <td class="tg-0lax">
    <#if art56.caseType.localCaseAdditionalInfo??>
	    <#list art56.caseType.localCaseAdditionalInfo as ckd>
			${ckd.description!},
		</#list>
    </#if>
    </td>
    <td class="tg-0lax">${art56.caseBackground.caseFileTitle!}</td>
    <td class="tg-0lax">${art56.caseBackground.caseNationalReferenceNumber!}</td>
    <td class="tg-0lax">${art56.caseBackground.caseProcessingDescription!}</td>
    <td class="tg-0lax">
    <#if art56.caseBackground.caseOrigin??>
	    <#list art56.caseBackground.caseOrigin as ckd>
			${ckd.description!},
		</#list>
    </#if>
	</td>
    <td class="tg-0lax">
    <#if art56.caseBackground.caseKindOfDecision??>
	    <#list art56.caseBackground.caseKindOfDecision as ckd>
			${ckd.description!},
		</#list>
	</#if>
    </td>
    <td class="tg-0lax">${art56.caseBackground.caseKindOfDecisionOther!}</td>
    <td class="tg-0lax">
   	<#if art56.caseBackground.caseTopic??>
	    <#list art56.caseBackground.caseTopic as caseTopic>
			${caseTopic.description!},
		</#list>
	</#if>
    </td>
    <td class="tg-0lax">${art56.caseBackground.caseTopicOther!}</td>
    <td class="tg-0lax">
    <#if art56.caseBackground.caseLegalReference??>
	    <#list art56.caseBackground.caseLegalReference as caseLegalReference>
			${caseLegalReference.description!},
		</#list>  
	</#if>
    </td>
    <td class="tg-0lax">${art56.caseBackground.caseLegalReferenceOther!}</td>
    <td class="tg-0lax">${art56.caseBackground.caseSecurityRequirements!}</td>
    <td class="tg-0lax">${art56.caseBackground.caseDescription!}</td>
    <td class="tg-0lax">${art56.caseBackground.caseDescriptionWithPersonalData!}</td>
    <td class="tg-0lax">
	<#if art56.assumedCSAOnetomanyList??>
	    <#list art56.assumedCSAOnetomanyList.assumedCSAOnetomanyList as assumedCSAOnetomanyList>
			${assumedCSAOnetomanyList.csaName.description!},
		</#list> 
	</#if>   
    </td>
  </tr>
</#list>

</tbody>
</table></div>
<script charset="utf-8">var TGSort=window.TGSort||function(n){"use strict";function r(n){return n?n.length:0}function t(n,t,e,o=0){for(e=r(n);o<e;++o)t(n[o],o)}function e(n){return n.split("").reverse().join("")}function o(n){var e=n[0];return t(n,function(n){for(;!n.startsWith(e);)e=e.substring(0,r(e)-1)}),r(e)}function u(n,r,e=[]){return t(n,function(n){r(n)&&e.push(n)}),e}var a=parseFloat;function i(n,r){return function(t){var e="";return t.replace(n,function(n,t,o){return e=t.replace(r,"")+"."+(o||"").substring(1)}),a(e)}}var s=i(/^(?:\s*)([+-]?(?:\d+)(?:,\d{3})*)(\.\d*)?$/g,/,/g),c=i(/^(?:\s*)([+-]?(?:\d+)(?:\.\d{3})*)(,\d*)?$/g,/\./g);function f(n){var t=a(n);return!isNaN(t)&&r(""+t)+1>=r(n)?t:NaN}function d(n){var e=[],o=n;return t([f,s,c],function(u){var a=[],i=[];t(n,function(n,r){r=u(n),a.push(r),r||i.push(n)}),r(i)<r(o)&&(o=i,e=a)}),r(u(o,function(n){return n==o[0]}))==r(o)?e:[]}function v(n){if("TABLE"==n.nodeName){for(var a=function(r){var e,o,u=[],a=[];return function n(r,e){e(r),t(r.childNodes,function(r){n(r,e)})}(n,function(n){"TR"==(o=n.nodeName)?(e=[],u.push(e),a.push(n)):"TD"!=o&&"TH"!=o||e.push(n)}),[u,a]}(),i=a[0],s=a[1],c=r(i),f=c>1&&r(i[0])<r(i[1])?1:0,v=f+1,p=i[f],h=r(p),l=[],g=[],N=[],m=v;m<c;++m){for(var T=0;T<h;++T){r(g)<h&&g.push([]);var C=i[m][T],L=C.textContent||C.innerText||"";g[T].push(L.trim())}N.push(m-v)}t(p,function(n,t){l[t]=0;var a=n.classList;a.add("tg-sort-header"),n.addEventListener("click",function(){var n=l[t];!function(){for(var n=0;n<h;++n){var r=p[n].classList;r.remove("tg-sort-asc"),r.remove("tg-sort-desc"),l[n]=0}}(),(n=1==n?-1:+!n)&&a.add(n>0?"tg-sort-asc":"tg-sort-desc"),l[t]=n;var i,f=g[t],m=function(r,t){return n*f[r].localeCompare(f[t])||n*(r-t)},T=function(n){var t=d(n);if(!r(t)){var u=o(n),a=o(n.map(e));t=d(n.map(function(n){return n.substring(u,r(n)-a)}))}return t}(f);(r(T)||r(T=r(u(i=f.map(Date.parse),isNaN))?[]:i))&&(m=function(r,t){var e=T[r],o=T[t],u=isNaN(e),a=isNaN(o);return u&&a?0:u?-n:a?n:e>o?n:e<o?-n:n*(r-t)});var C,L=N.slice();L.sort(m);for(var E=v;E<c;++E)(C=s[E].parentNode).removeChild(s[E]);for(E=v;E<c;++E)C.appendChild(s[v+L[E-v]])})})}}n.addEventListener("DOMContentLoaded",function(){for(var t=n.getElementsByClassName("tg"),e=0;e<r(t);++e)try{v(t[e])}catch(n){}})}(document)</script>   

</body>
</html>