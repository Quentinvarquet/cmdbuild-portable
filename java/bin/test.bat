for /r %i in (*.pack) do .\bin\unpack200.exe “%i” “%~pi%~ni.jar”

pause