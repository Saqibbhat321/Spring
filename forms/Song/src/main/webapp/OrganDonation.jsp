<html>
<body>
<h2>Hello World!</h2>
<h1>OrganDonation<h1>
<pre>
<form action="organDonationServlet" method="post">
    Donor Name: <input type="text" name="donorName"><br>
    Recipient Name: <input type="text" name="recipientName"><br>
    Organ Type:
    <select name="organType">
        <option value="Kidney">Kidney</option>
        <option value="Liver">Liver</option>
        <option value="Heart">Heart</option>
        <option value="Lungs">Lungs</option>
        <option value="Pancreas">Pancreas</option>
    </select><br>
    Donor Age: <input type="number" name="donorAge"><br>
    Recipient Age: <input type="number" name="recipientAge"><br>
    Donation Date: <input type="date" name="donationDate"><br>
    Hospital Name: <input type="text" name="hospitalName"><br>
    Blood Type: <input type="text" name="bloodType"><br>
    Contact Number: <input type="text" name="contactNumber"><br>
    Medical Condition: <input type="text" name="medicalCondition"><br>
    <button type="submit">Submit</button>
</form>
</pre>
</body>
</html>