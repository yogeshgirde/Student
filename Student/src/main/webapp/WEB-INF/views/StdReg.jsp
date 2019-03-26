<html>
<body>
<h3>Student Registration Form</h3>
 <form action="save" method="POST">
 <pre>
 SID  :<input type="text" name="stdId"/>
 SName:<input type="text" name="stdName"/>
 SFee :<input type="text" name="stdFee"/>
 SCourse:<select name="scourse">
          <option>core java</option>
          <option>Advance java</option>
          <option>Spring</option>
        </select>
 Address:<textarea name="saddr"></textarea>
 LANG :<input type="checkbox" name="slang"value="Telagu">Telagu<br>
       <input type="checkbox" name="slang"value="English">Enlish<br>
         GENDER:<input type="radio" name="sgen" value="male" >Male<br>
     <input type="radio" name="sgen" value="female" >Female<br>
 <input type="submit" value="Register">
 </pre>
 
 </form>
</body>
</html>