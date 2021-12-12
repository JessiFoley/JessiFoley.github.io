# Southern New Hampshire University
## Computer Science Final Portfolio

**Self-Assessment**


**Code Review**
<div align="center">
	<iframe 
		width="560" 
		height="315" 
		src="https://www.youtube.com/embed/opgMi7zOZHo" 
		title="YouTube video player" 
		frameborder="0" 
		allow="accelerometer; 
		autoplay; 
		clipboard-write; 
		encrypted-media; 
		gyroscope; 
		picture-in-picture" 
		allowfullscreen>
	</iframe>
</div>

**Category One: Software Engineering/Design**

- **Narrative**
<div align="left">
&emsp;The artifact I chose was a personal project that I had done for my use only. The idea behind it came from playing a game called World of Warcraft. When you make a character, you must choose several options including what class you want to play. I always have trouble deciding so I made a random generator that would choose a class for me. I made it in Python, and it had many flaws, including not having any form of a GUI. Since I created it early in my learning process for classes, I really had no idea what I was doing, and it left the code very bloated with a lot of unnecessary steps.  
<br>&emsp;I have included this project because I know I can do better. I learned how to make a reasonable GUI in Java and so I decided to port the code over to Java and simplify it as much as possible to prepare it for the next steps of adding more options and features to it. Right now, the biggest improvement that has been made is to use a GUI and to make it so that the user can reroll the choice as many times as they want. This new program shows off my skills with Java. I feel like that is important since I prefer to use and write in Java more than any other language. It also helped me learn more about my weakest areas in Java, using and creating a GUI. 
<br>&emsp;I feel like I met the course objectives because I took an old program written in Python and was able to rewrite it in Java, while at the same time enhancing what the program could do. I had originally planned many more changes, but time did not allow me to get those finished quite yet. I have learned a lot about best practices and keeping a program simple to help with future updates and coding.  
<br></div>
- **Artifact**  
<div align="center">  
Project Folder: <a href="https://github.com/JessiSNHU/JessiSNHU.github.io/tree/main/Artifacts/WoWRandomizerArtifact1">WoWRandomizerArtifact1</a><br>
Zip file: <a href="https://github.com/JessiSNHU/JessiSNHU.github.io/blob/main/Artifacts/ZipFiles/WoWRandomizerArtifact1.zip">WoWRandomizerArtifact1.zip</a>  
</div>  
		
**Category Two: Algorithms and Data Structures**

- **Narrative**
<div align="left">
&emsp;The artifact being used is a continuation of the previous artifact. It is a World of Warcraft class and race randomizer. The randomizer will offer the user choices so that they can affect and narrow down what they will get based on their preferences. If the user wants their role in the game to be tank or healer, then they can narrow the random selection to tank or healing classes. I have chosen to use the same artifact because I felt like it could be expanded on and that it would potentially be marketable to players of World of Warcraft, and it could be changed to also cover other games such as Final Fantasy 14.
<br>&emsp;The main additions to this artifact from the first one is the inclusion of a filter. This filtering system allows the user to set their preferences as to what kind of class or race they would like to play. Specific skills showcased here are an ability to include a functional menu system, as well as the development of global variables that hold the preferences of the user. A potential addition here would be to add a file to retain user preferences across instances of the program. I also demonstrated my ability to use OOP techniques by creating a Character class that holds all the information that is randomly rolled. This able to then be used later if I want to expand on what the program offers users. For instance, I could link to other sites for leveling guides for each class, or with the inclusion of a database, I could provide users a list of heirloom armor with which they can use to level.
<br>&emsp;This artifact was one I had to put a lot of thought into the design of. I was not sure how I wanted to evolve my simple random generator. I ended up talking about it to my close friends. With them, I was able to develop a better picture out of what we would find useful in such a program. I ran into a few challenges because certain aspects of the program would be easier if I made use of a database to hold class and race information as well as their relationships to each other. I found that using OOP principals made storing the character information easier after I made the random selections, and from there things started falling into place. 
<br></div>
- **Artifact**
<div align="center">  
Project Folder: <a href="https://github.com/JessiSNHU/JessiSNHU.github.io/tree/main/Artifacts/WoWRandomizerArtifact2">WoWRandomizerArtifact2</a><br>
Zip file: <a href="https://github.com/JessiSNHU/JessiSNHU.github.io/blob/main/Artifacts/ZipFiles/WoWRandomizerArtifact2.zip">WoWRandomizerArtifact2.zip</a>  
</div>  
**Category Three: Databases**

- **Narrative**
<div align="left">
&emsp;Once again, the artifact being used for this assignment is a continuation of the previous two artifacts. The app is a World of Warcraft class and race randomizer. This program has a filter that lets you choose the role you want to play in groups, either tank, healer, or dps. It also has filters for allied races and faction. This gives the user freedom to make certain choices while still getting a random character.
<br>&emsp;This week, the main addition is that the app makes use of a database. The database is postgresql. It contains the information on each race such as faction, allied status, and class availability. A second table contains class, spec, and race availability. The second table also contains armor type for each class for possible future use in showing the best armor to use for leveling. Enhancements this week are the inclusion of database classes to retrieve class, role, and race information. There is also a function that connects to the database to avoid repeating code where possible. Class structure is set up so that there is a class that holds character information, a class that rolls the random information and a class for access to the database. It is structured to organize the functions based on categories and what their uses are.
<br>&emsp;I learned a lot this week about database hosting and usage. I have not had to write database code in almost six years, so this was an excellent refresher for what needed to be done. I really struggled with setting up the Java access to the database because I had to learn how to include external libraries and make use of classes that others had written. I sought out a couple of extra classes to improve the user experience. It was discovered during third party testing that the menu closing after every selection quickly became quite annoying, so I found a way to fix the issue. Overall, this week had a lot of struggles that I overcame through using resources such as tutorials and Stack Overflow.
 <br></div>
- **Artifact**
<div align="center">  
Project Folder: <a href="https://github.com/JessiSNHU/JessiSNHU.github.io/tree/main/Artifacts/WoWRandomizerArtifact3">WoWRandomizerArtifact3</a><br>
Zip file: <a href="https://github.com/JessiSNHU/JessiSNHU.github.io/blob/main/Artifacts/ZipFiles/WoWRandomizerArtifact3.zip">WoWRandomizerArtifact3.zip</a>  
</div>  

**Link to the GitHub for the Project**  
Github Page: <a href="https://github.com/JessiSNHU/WowRandomizer">WowRandomizer</a>  
Final Release: <a href="https://github.com/JessiSNHU/WowRandomizer/releases">Releases</a>  
