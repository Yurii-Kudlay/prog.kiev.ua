package lesson3.dev;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Developer[] list = {
				new JuniorDeveloper("Yurii", 500, 0),
				new JuniorDeveloper("Dima", 500, 2),
				new JuniorDeveloper("Vova", 500, 1),
				new SeniorDeveloper("Jack", 500, 5),
				new MiddleDeveloper("Mike", 500, 3),
				new TeamLeadDeveloper("Robby", 500, 7),
				new MiddleDeveloper("Andrew", 500, 4)
		};

		JuniorDeveloper[] jun = new JuniorDeveloper[list.length];
		int jd = 0;

		MiddleDeveloper[] mid = new MiddleDeveloper[list.length];
		int md = 0;

		SeniorDeveloper[] sen = new SeniorDeveloper[list.length];
		int sd = 0;

		TeamLeadDeveloper[] teamLead = new TeamLeadDeveloper[list.length];
		int tm = 0;

		for (Developer dev : list){
			if (dev instanceof JuniorDeveloper){
				jun[jd++] = (JuniorDeveloper)dev;
			}else if (dev instanceof MiddleDeveloper) {
				mid[md++] = (MiddleDeveloper) dev;
			}else if (dev instanceof SeniorDeveloper){
				sen[sd++] = (SeniorDeveloper)dev;
			}else{
				teamLead[tm++] = (TeamLeadDeveloper)dev;
			}
		}

		jun = Arrays.copyOf(jun, jd);
		mid = Arrays.copyOf(mid, md);
		sen = Arrays.copyOf(sen, sd);
		teamLead = Arrays.copyOf(teamLead, tm);

		StringBuilder sb;

		System.out.println("Junior developer: ");
		for (Developer d : jun) {
			sb = new StringBuilder()
				.append(d.getName())
				.append(": ")
				.append(d.getBasicSalary())
				.append(" -> ")
				.append(d.getSalary());
			
			System.out.println(sb.toString());
		}
		System.out.println("------------------------------");


		System.out.println("Middle developer: ");
		for (Developer d : mid) {
			sb = new StringBuilder() // !!!
					.append(d.getName())
					.append(": ")
					.append(d.getBasicSalary())
					.append(" -> ")
					.append(d.getSalary());

			System.out.println(sb.toString());
		}
		System.out.println("------------------------------");


		System.out.println("Senior developer: ");
		for (Developer d : sen) {
			sb = new StringBuilder()
					.append(d.getName())
					.append(": ")
					.append(d.getBasicSalary())
					.append(" -> ")
					.append(d.getSalary());

			System.out.println(sb.toString());
		}
		System.out.println("------------------------------");


		System.out.println("Team lead developer: ");
		for (Developer d : teamLead) {
			sb = new StringBuilder() // !!!
					.append(d.getName())
					.append(": ")
					.append(d.getBasicSalary())
					.append(" -> ")
					.append(d.getSalary());

			System.out.println(sb.toString());
		}
		System.out.println("------------------------------");
	}
}
