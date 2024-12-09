<html>
<body>
<h2>Hello World!</h2>
<h1>Scholarship Form<h1>
<pre>
<form action="scholarshipServlet" method="post">
    Student Name: <input type="text" name="studentName"><br>
    Course Name: <input type="text" name="courseName"><br>
    Scholarship Amount: <input type="number" name="scholarshipAmount" step="0.01"><br>
    Scholarship Type:
    <select name="scholarshipType">
        <option value="Merit-Based">Merit-Based</option>
        <option value="Need-Based">Need-Based</option>
        <option value="Sports">Sports</option>
        <option value="Community">Community</option>
    </select><br>
    Application Date: <input type="date" name="applicationDate"><br>
    <button type="submit">Submit</button>
</form>
</pre>
</body>
</html>