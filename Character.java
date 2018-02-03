//Jack Wood

import java.util.Scanner;

public class Character 
{
	protected String playerName, characterName, characterRace,
				     size, alignment, description;
	
	protected Player player;
	
	protected CharacterClass characterClass;
	
	protected   Group characterClasses,
					  skills,
					  feats,
					  strengthBasedSkills,
					  dexterityBasedSkills, 
					  constitutionBasedSkills, 
					  wisdomBasedSkills,
					  intelligenceBasedSkills,
					  charismaBasedSkills,
					  weaponReadied,
					  weaponOnPerson,
					  armorWorn,					 
					  gearOnPerson;
	
	protected AbilityScore strength = new AbilityScore("strength"),
						   dexterity = new AbilityScore("dexterity"),
						   constitution = new AbilityScore("consititution"),
						   wisdom = new AbilityScore("wisdom"),
						   intelligence = new AbilityScore("intelligence"),
						   charisma = new AbilityScore("charisma");
	
	protected SavingThrow fortitude = new SavingThrow(),
						  reflex = new SavingThrow(),
						  will = new SavingThrow();
						  
	
	protected AttackModifier baseAttackBonus = new AttackModifier(),
						     grapple = new AttackModifier(),
						     melee = new AttackModifier(), 
						     ranged = new AttackModifier();
	
	
	protected int experiencePoints, level,
				  totalHitPoints, currentHitPoints,
				  initiative, initiativeModifier, 
				  speed,
				  armorClass, sizeModifier, naturalArmorModifier, armorClassModifier, 
				  skillPoints,
				  age;
	
	protected Weapon mainWeapon,
					 offHandWeapon;
	
	protected Armor wornArmor,
					wornShield;
	
	public Character()
	{
		this("Name Unknown", null);
	}
	
	public Character(String name, Player player)
	{
		setPlayerName(name);
		
		player(player);
		
		setPersonalInfo();
		
		rollAbilityScores();
		
		setInitiative(0);
		
		setArmorClass();
		
		setSavingThrows();
		
		setSkills();		
	}	
	
	public void setPersonalInfo()
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Type a name for this Character here:");
		
		setCharacterName(keyboard.nextLine());
		
		return;
	}
	
	public void setSavingThrow()
	{
		for(int i = 0; i < characterClass.length; i++)
		{
			fortitude = new SavingThrow("fortitude", characterClass[i].getFortitudeSave(), constitution.getModifier(), 0, 0);
			reflex = new SavingThrow("reflex", characterClass[i].getReflexSave(), dexterity.getModifier(), 0, 0);
			will = new SavingThrow("will", characterClass[i].getWillSave(), wisdom.getModifier(), 0, 0);
		}
	}
	
	public void setPlayerName(String name)
	{
		playerName = name;
		
		return;
	}
	
	public String getPlayerName()
	{
		return playerName;
	}
	
	public void setCharacterName(String name)
	{
		characterName = name.trim();
	}
	
	public String getCharacterName()
	{
		return characterName;
	}
	
	public void setCharacterRace(String race)
	{
		characterRace = race;
		
		return;
	}
	
	public String getCharacterRace()
	{
		return characterRace;
	}
	
	public void addCharacterClass(String classType)
	{
		return;
	}
	
	public CharacterClass[] getCharacterClass()
	{
		return characterClass;
	}
	
	public void setSize(String size)
	{
		this.size = size;
		
		if(size.equals("medium"))
		{
			this.sizeModifier = 0;
		}
		else if(size.equals("small"))
		{
			this.sizeModifier = 1;
		}
		
		return;
	}
	
	public String getSize()
	{
		return size;
	}
	
	public void setAlignment(String alignment)
	{
		this.alignment = alignment;
		
		return;
	}
	
	public String getAlignment()
	{
		return alignment;
	}
	
	public void setDescription(String description)
	{
		this.description = description.trim();
		
		return;
	}
	
	public String getDescription()
	{
		return description;
	}
	
 	public void setInitiative()
	{
		setInitiative(0);
	}
	
	public void setInitiative(int misc)
	{
		initiative = dexterity.getModifier() + misc;
	}
	
	public int getInitiative()
	{
		return initiative;
	}
	
	public void setSpeed(int speed)
	{
		this.speed = speed;
		
		return;
	}
	
	public int getSpeed()
	{
		return speed;
	}

	public void setSkills()
	{
		setStrengthBasedSkills();
		setDexterityBasedSkills();
		setConstitutionBasedSkills();
		setWisdomBasedSkills();
		setIntelligenceBasedSkills();
		setCharismaBasedSkills();
	}
	
 	public void setStrengthBasedSkills()
	{
		int i = 0;
		
		strengthBasedSkills = new Skill[3];
		                    
		Skill climb = new Skill("climb", strength);
		Skill jump = new Skill("jump", strength);
		Skill swim = new Skill("swim", strength);
		
		strengthBasedSkills[i++] = climb;
		strengthBasedSkills[i++] = jump;
		strengthBasedSkills[i] = swim;
	}
	
	public void setDexterityBasedSkills()
	{
		int i = 0;
		
		dexterityBasedSkills = new Skill[9];
		
		Skill balance = new Skill("balance", dexterity);
		Skill escapeArtist = new Skill("escape artist", dexterity);
		Skill hide = new Skill("hide", dexterity);
		Skill moveSilently = new Skill("move silently", dexterity);
		Skill openLock = new Skill("open lock", dexterity);
		Skill ride = new Skill("ride", dexterity);
		Skill sleightOfHand = new Skill("sleight of hand", dexterity);
		Skill tumble = new Skill("tumble", dexterity);
		Skill useRope = new Skill("use rope", dexterity);
		
		dexterityBasedSkills[i++] = balance;
		dexterityBasedSkills[i++] = escapeArtist;
		dexterityBasedSkills[i++] = hide;
		dexterityBasedSkills[i++] = moveSilently;
		dexterityBasedSkills[i++] = openLock;
		dexterityBasedSkills[i++] = ride;
		dexterityBasedSkills[i++] = sleightOfHand;
		dexterityBasedSkills[i++] = tumble;
		dexterityBasedSkills[i] = useRope;
	}
	
	public void setConstitutionBasedSkills()
	{
		int i = 0;
		
		constitutionBasedSkills = new Skill[1];
		
		Skill concentration = new Skill("concentration", constitution);
		
		constitutionBasedSkills[i++] = concentration;
	}
	
	public void setWisdomBasedSkills()
	{
		int i = 0;
		
		wisdomBasedSkills = new Skill[6];
		
		Skill heal = new Skill("heal", wisdom);
		Skill listen = new Skill("listen", wisdom);
		Skill profession = new Skill("profession", wisdom);
		Skill senseMotive = new Skill("sense motive", wisdom);
		Skill spot = new Skill("spot", wisdom);
		Skill survival = new Skill("survival", wisdom);
		
		wisdomBasedSkills[i++] = heal;
		wisdomBasedSkills[i++] = listen;
		wisdomBasedSkills[i++] = profession;
		wisdomBasedSkills[i++] = senseMotive;
		wisdomBasedSkills[i++] = spot;
		wisdomBasedSkills[i] = survival;
	}
	
	public void setIntelligenceBasedSkills()
	{
		int i = 0;
		
		intelligenceBasedSkills = new Skill[16];
		
		Skill craft = new Skill("craft", intelligence);
		Skill decipherScript = new Skill("decipher script", intelligence);
		Skill disableDevice = new Skill("disable device", intelligence);
		Skill forgery = new Skill("forgery", intelligence);
		Skill knowledgeOfArcana = new Skill("knowledge of arcana", intelligence);
		Skill knowledgeOfArchitectureAndEngineering = new Skill("knowledge of architecture and engineering", intelligence);
		Skill knowledgeOfDungeoneering = new Skill("knowledge of dungeoneering", intelligence);
		Skill knowledgeOfGeography = new Skill("knowledge of geography", intelligence);
		Skill knowledgeOfHistory = new Skill("knowledge of history", intelligence);
		Skill knowledgeOfLocal = new Skill("knowledge of local", intelligence);
		Skill knowledgeOfNature = new Skill("knowledge of nature", intelligence);
		Skill knowledgeOfNobilityAndRoyalty = new Skill("knowledge of nobility and royalty", intelligence);
		Skill knowledgeOfReligion = new Skill("knowledge of religion", intelligence);
		Skill knowledgeOfThePlanes = new Skill("knowledge of the planes", intelligence);
		Skill search = new Skill("search", intelligence);
		Skill spellcraft = new Skill("spellcraft", intelligence);
		
		
		intelligenceBasedSkills[i++] = craft;
		intelligenceBasedSkills[i++] = decipherScript;
		intelligenceBasedSkills[i++] = disableDevice;
		intelligenceBasedSkills[i++] = forgery;
		intelligenceBasedSkills[i++] = knowledgeOfArcana;
		intelligenceBasedSkills[i++] = knowledgeOfArchitectureAndEngineering;
		intelligenceBasedSkills[i++] = knowledgeOfDungeoneering;
		intelligenceBasedSkills[i++] = knowledgeOfGeography;
		intelligenceBasedSkills[i++] = knowledgeOfHistory;
		intelligenceBasedSkills[i++] = knowledgeOfLocal;
		intelligenceBasedSkills[i++] = knowledgeOfNature;
		intelligenceBasedSkills[i++] = knowledgeOfNobilityAndRoyalty;
		intelligenceBasedSkills[i++] = knowledgeOfReligion;
		intelligenceBasedSkills[i++] = knowledgeOfThePlanes;
		intelligenceBasedSkills[i++] = search;
		intelligenceBasedSkills[i++] = spellcraft;
	}

	public void setCharismaBasedSkills()
	{
		int i = 0;
		
		charismaBasedSkills = new Skill[16];
		
		Skill bluff = new Skill("bluff", charisma);
		Skill diplomacy = new Skill("diplomacy", charisma);
		Skill disguise = new Skill("disguise", charisma);
		Skill gatherInformation = new Skill("gather information", charisma);
		Skill handleAnimal = new Skill("handle animal", charisma);
		Skill intimidate = new Skill("intimidate", charisma);
		Skill perform = new Skill("perform", charisma);
		Skill useMagicDevice = new Skill("use magic device", charisma);
	
		charismaBasedSkills[i++] = bluff;
		charismaBasedSkills[i++] = diplomacy;
		charismaBasedSkills[i++] = disguise;
		charismaBasedSkills[i++] = gatherInformation;
		charismaBasedSkills[i++] = handleAnimal;
		charismaBasedSkills[i++] = intimidate;
		charismaBasedSkills[i++] = perform;
		charismaBasedSkills[i++] = useMagicDevice;
	}
	
	public void setArmorClass()
	{
		setArmorClass(0);
	}
	
	public void setArmorClass(int misc)
	{
		armorClass = 10 + dexterity.getModifier() + misc;
	}
	
	public int getArmorClass()
	{
		return armorClass;
	}
	
	public void rollAbilityScores()
	{
		this.strength.rollNewScore();
		this.dexterity.rollNewScore();
		this.constitution.rollNewScore();
		this.wisdom.rollNewScore();
		this.intelligence.rollNewScore();
		this.charisma.rollNewScore();
	}
	
	public void setSavingThrows()
	{
		fortitude.getBaseSave();
		reflex.getBaseSave();
		will.getBaseSave();
	}
	
	public void setAttackModifier()
	{
		grapple.getMod();
		melee.getMod();
		ranged.getMod();
	}
	
	public void randomAge(){}
	
	public void age(int age)
	{
		this.age = age;
	}
	
	public int age()
	{
		return age;
	}
	
	public void player(Player player)
	{
		this.player = player;
	}

	public Player player()
	{		
		return player;
	}
	
}
