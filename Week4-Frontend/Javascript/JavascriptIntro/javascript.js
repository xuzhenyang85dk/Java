window.addEventListener("load", function()
{
	document.getElementById("button1").addEventListener("click", function1);	
});


function function1()
{
	document.getElementById("paragraph1").innerHTML = "Paragraph text changed";
	document.getElementById("paragraph1").style.backgroundColor = "red";
	document.getElementById("button1").setAttribute("type", "radio");
	
	$('h1').css('background', 'green');
	
	$('body').append('<h2>Heading2 added</h2>');
}