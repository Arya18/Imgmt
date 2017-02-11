var _validFileExtensions = [".csv"];    
function validateFileInput(oInput) {
    if (oInput.type == "file") {
        var sFileName = oInput.value;
        console.log(sFileName)
         if (sFileName.length > 0) {
            var blnValid = false;
            for (var j = 0; j < _validFileExtensions.length; j++) {
                var sCurExtension = _validFileExtensions[j];
                console.log(sCurExtension)
                console.log(sFileName.substr(sFileName.length - sCurExtension.length, sCurExtension.length).toLowerCase())
                if (sFileName.substr(sFileName.length - sCurExtension.length, sCurExtension.length).toLowerCase() == sCurExtension.toLowerCase()) {
                    blnValid = true;
                    break;
                }
            }
             
            if (!blnValid) {
                /*alert("Sorry, " + sFileName + " is invalid, allowed extensions are: " + _validFileExtensions.join(", "));*/
                $(".importErrMsg").html("<div class='alert alert-danger text-center'><a href='#' class='close' data-dismiss='alert' aria-label='close'>&times;</a><strong>Sorry this " +sFileName+" file extension is not valid, allowed extensions are: "+_validFileExtensions+"  </strong></div>");
                oInput.value = "";
                return false;
            }
        }
    }
    return true;
}