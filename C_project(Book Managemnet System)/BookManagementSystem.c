#include<stdio.h>
#include<stdlib.h>
#include<string.h>

typedef struct Date {

	int dd;
	int mm;
	int yy;

} Date;

typedef struct Book {

	int bookId;
	char bookName[100];
	char Authorname[100];
	char Category[50];
	double price;
	float rating;
	Date issuedate;
} Book;

void addbook();
void removebook();
void searchbook();
void categorybooks();
void sortbooks();
void update();
void displayall();
void showauthorsbook();
void top3books();
void hardCodeValue();
void  issuebook();
void displayavailablebook();

void main() {

	int choice,size;

	int bookcount=0;

	while(1) {

		printf("---How many Books do you want to store? ---:");
		int check=scanf("%d",&size);

		if(check == 1 && size > 0) {

			break;
		} else {
			printf("\tInvalid input! Please enter a number\n");
			fflush(stdin);
		}
	
	}
		int maxSize = 5;
		size = size + maxSize;
	Book *bookDb;

	bookDb = (Book*)malloc(sizeof(Book) * size);
	hardCodeValue(bookDb, &bookcount);
	printf("Book count = %d",bookcount);

	do {

		printf("\n-------- Book Management System --------\n");
		printf("1. Add Book\n");
		printf("2. Remove Book\n");
		printf("3. Search Book\n");
		printf("4. Show Books by Author\n");
		printf("5. Show Books by Category\n");
		printf("6. Update Book Details\n");
		printf("7. Display Sorted Books\n");
		printf("8. Display all Books\n");
		printf("9.Display Top 3 Books\n");
		printf("10.Display available book\n");
		printf("11.Issue Book\n");
		printf("12.Exit----!!\n");
		printf("----------------------------------------\n");

		printf("Enter your choice: ");
		scanf("%d", &choice);

		switch (choice) {
			case 1: {

				if(bookcount<=size) {
					addbook(bookDb, &bookcount,size);
				}

				break;
			}
			case 2:
				removebook(bookDb, &bookcount);
				break;
			case 3:
				searchbook(bookDb, bookcount);
				break;
			case 4:
				showauthorsbook(bookDb, bookcount);
				break;
			case 5:
				categorybooks(bookDb, bookcount);
				break;
			case 6:
				update(bookDb, &bookcount);
				break;
			case 7:

				printf("Sort by:\n1. Price\n2. Rating\nEnter choice: ");
				int sortChoice;
				scanf(" %d",&sortChoice);
				sortbooks(bookDb, bookcount, sortChoice);
				break;

			case 8:
				displayall(bookDb, bookcount);
				break;

			case 9:
				printf("Top 3 books:\n1. Price\n2. Rating\nEnter choice: ");
				int sort1choice;
				scanf(" %d",&sort1choice);
				top3books(bookDb,&bookcount, sort1choice);
				break;

			case 10:

				displayavailablebook(bookDb,bookcount);
				break;

			case 11:

				issuebook(bookDb,bookcount);
				break;

			case 12:

				printf("Exiting program...\n");
				free(bookDb);
				break;

			default:
				printf("Invalid choice.....\n");
		}
	} while (choice != 12);


}

void addbook(Book* bookDb, int* bookcount, int size) {

	printf("---Enter the details of the book you want to add--");

	printf("\nEnter the ID of the book:");
	scanf("%d",&bookDb[*bookcount].bookId);
	fflush(stdin);

	printf("\nEnter the name of the book:");
	gets(bookDb[*bookcount].bookName);

	printf("\nEnter the author name:");
	gets(bookDb[*bookcount].Authorname);

	printf("\nEnter the category of the book:");
	gets(bookDb[*bookcount].Category);


	printf("\nEnter the price of book:");
	scanf("%lf",&bookDb[*bookcount].price);

	printf("\nEnter the rating of the book:");
	scanf("%f",&bookDb[*bookcount].rating);

	bookDb[*bookcount].issuedate.dd=00;
	bookDb[*bookcount].issuedate.mm=00;
	bookDb[*bookcount].issuedate.yy=00;


	printf("Book added successfully!!!");
	(*bookcount)++;
}


void removebook(Book* bookDb, int* bookcount) {

	int id, i, found = 0;

	if (*bookcount == 0) {
		printf("No books available to remove.\n");
		return;
	}

	printf("Enter the ID of the book to remove: ");
	scanf("%d", &id);

	for (i = 0; i < *bookcount; i++) {
		if (bookDb[i].bookId == id) {
			found = 1;
			break;
		}
	}

	if (!found) {
		printf("Book with ID %d not found.\n", id);
		return;
	}


	for (; i < *bookcount - 1; i++) {
		bookDb[i] = bookDb[i + 1];
	}

	(*bookcount)--;
	printf("Book with ID %d removed successfully!\n", id);
}

void searchbook(Book* bookDb, int bookcount) {

	int choice;
	printf("Do you want to search the book by :\n1.By Id\n2.By name:");
	scanf("%d",&choice);
	fflush(stdin);

	if(choice==1) {

		int id,i,found=0;

		printf("Enter the book id want to  search:");
		scanf("%d",&id);
		fflush(stdin);

		for(i=0; i<bookcount; i++) {

			if(bookDb[i].bookId ==id) {

				printf("Book found...\n");
				printf("Id:%d\n",bookDb[i].bookId);
				printf("Name:%s\n",bookDb[i].bookName);
				printf("Author: %s\n", bookDb[i].Authorname);
				printf("Category: %s\n", bookDb[i].Category);
				printf("Price: %.2lf\n", bookDb[i].price);
				printf("Rating: %f\n", bookDb[i].rating);

				found=1;

				break;

			}
		}

		if(found==0)
			printf("\nBook with id:%d not found..",id);

	} else {

		char name[30];
		int i,found=0;

		printf("Enter the book name you want to search:\n");
     	gets(name);


		for(i=0; i<bookcount; i++) {

			if(strcasecmp(bookDb[i].bookName,name)==0) {


				printf("------Book found-----\n");
				printf("Id:%d\n",bookDb[i].bookId);
				printf("Name:%s\n",bookDb[i].bookName);
				printf("Author: %s\n", bookDb[i].Authorname);
				printf("Category: %s\n", bookDb[i].Category);
				printf("Price: %.2lf\n", bookDb[i].price);
				printf("Rating: %f\n", bookDb[i].rating);

				found=1;

				break;


			}
		}

		if(found==0)
			printf("Book with %s name not found!!!",name);


	}
}

void showauthorsbook(Book* bookDb,int bookcount) {


	char author[30];
    printf("Enter the Authors name:");
	gets(author);


	int i,found=0;

	for(i=0; i<bookcount; i++) {

		if(strcasecmp(bookDb[i].Authorname,author)==0) {

			printf("\nId:%d",bookDb[i].bookId);
			printf("\nName:%s",bookDb[i].bookName);
			printf("\nAuthor name:%s",bookDb[i].Authorname);
			printf("\nCategory:%s",bookDb[i].Category);
			printf("\nPrice:%lf",bookDb[i].price);
			printf("\nRating:%f",bookDb[i].rating);

			found=1;
		}

	}

	if(found==0)
		printf("Book with %s name not found!!",author);
}

void categorybooks(Book* bookDb,int bookcount) {

	char category[30];

	printf("Enter the Category name:");
	gets(category);


	int i,found=0;

	for(i=0; i<bookcount; i++) {

		if(strcasecmp(bookDb[i].Category,category)==0) {


			found=1;
			printf("\nId:%d",bookDb[i].bookId);
			printf("\nName:%s",bookDb[i].bookName);
			printf("\nAuthor name:%s",bookDb[i].Authorname);
			printf("\nCategory:%s",bookDb[i].Category);
			printf("\nPrice:%lf",bookDb[i].price);
			printf("\nRating:%f",bookDb[i].rating);


		}

	}

	if(found==0)
		printf("Book with %s category name not found!!",category);


}

void update(Book* bookDb,int* bookcount) {

	int id;

	printf("Enter the id of the book you want to update:");
	scanf("%d",&id);
     	fflush(stdin);
     	
	int i,found=0;

	for(i=0; i<*bookcount; i++) {

		if(bookDb[i].bookId==id) {

			found=1;
		   
		   	printf("Enter the new name of the book:");
         	gets(bookDb[i].bookName);
         		fflush(stdin);

         	printf("Enter new author: ");
         	gets(bookDb[i].Authorname);
             	fflush(stdin);
             	
        	printf("Enter new category: ");
        	gets(bookDb[i].Category);
             	fflush(stdin);
             	
			printf("Enter new price: ");
			scanf("%lf", &bookDb[i].price);

			printf("Enter new rating: ");
			scanf("%f", &bookDb[i].rating);

			printf("----Book updated successfully!\n----");
		}
	}

	if(found==0)
		printf("Book at id:%d not found",id);
}


void sortbooks(Book* bookDb, int bookcount, int sortChoice) {

	int i,j,k;
	Book tempDb[bookcount];

	for(i=0; i<bookcount; i++) {

		tempDb[i]=bookDb[i];
	}


	for (i = 0; i < bookcount - 1; i++) {
		for (j = i + 1; j < bookcount; j++) {
			if ((sortChoice == 1 && tempDb[i].price > tempDb[j].price) ||
			        (sortChoice == 2 && tempDb[i].rating < tempDb[j].rating)) {
				Book temp = tempDb[i];
				tempDb[i] = tempDb[j];
				tempDb[j] = temp;
			}
		}
	}

	printf("\nSorted Books:\n");
	for (k = 0; k < bookcount; k++) {
		printf("ID: %d, Name: %s, Price: %.2lf, Rating: %f\n",
		       tempDb[k].bookId, tempDb[k].bookName, tempDb[k].price, tempDb[k].rating);
	}
}


void displayall(Book* bookDb,int bookcount) {

	int i;
	printf("----The List of all books----");
	for(i=0; i<bookcount; i++) {

		printf("\nId:%d",bookDb[i].bookId);
		printf("\nBook Name:%s",bookDb[i].bookName);
		printf("\nAuthors Name:%s",bookDb[i].Authorname);
		printf("\nCategory of the Book:%s",bookDb[i].Category);
		printf("\nPrice:%lf",bookDb[i].price);
		printf("\nRating:%f",bookDb[i].rating);
	}
}



void hardCodeValue(Book* bookDb, int* bookcount) {

	bookDb[*bookcount].bookId = 101;
	strcpy(bookDb[*bookcount].bookName, "abc");
	strcpy(bookDb[*bookcount].Authorname, "collen");
	strcpy(bookDb[*bookcount].Category, "Thriller");
	bookDb[*bookcount].price = 500;
	bookDb[*bookcount].rating = 5;
	bookDb[*bookcount].issuedate.dd=04;
	bookDb[*bookcount].issuedate.mm=05;
	bookDb[*bookcount].issuedate.yy=2024;

	printf("---- Book %d Added... ----\n", *bookcount+1);
	(*bookcount)++;

	bookDb[*bookcount].bookId = 111;
	strcpy(bookDb[*bookcount].bookName, "Alchemist");
	strcpy(bookDb[*bookcount].Authorname, "abc");
	strcpy(bookDb[*bookcount].Category, "motivational");
	bookDb[*bookcount].price = 450;
	bookDb[*bookcount].rating = 4;
	bookDb[*bookcount].issuedate.dd=00;
	bookDb[*bookcount].issuedate.mm=00;
	bookDb[*bookcount].issuedate.yy=00;
	printf("---- Book %d Added... ----\n", *bookcount+1);
	(*bookcount)++;

	bookDb[*bookcount].bookId = 112;
	strcpy(bookDb[*bookcount].bookName, "Shatter");
	strcpy(bookDb[*bookcount].Authorname, "xyz");
	strcpy(bookDb[*bookcount].Category, "Thriller");
	bookDb[*bookcount].price = 350;
	bookDb[*bookcount].rating = 3;
	bookDb[*bookcount].issuedate.dd=02;
	bookDb[*bookcount].issuedate.mm=10;
	bookDb[*bookcount].issuedate.yy=2024;
	printf("---- Book %d Added... ----\n", *bookcount+1);
	(*bookcount)++;

	bookDb[*bookcount].bookId = 132;
	strcpy(bookDb[*bookcount].bookName, "Universe");
	strcpy(bookDb[*bookcount].Authorname, "tanvi");
	strcpy(bookDb[*bookcount].Category, "crime");
	bookDb[*bookcount].price = 250;
	bookDb[*bookcount].rating = 5;
	bookDb[*bookcount].issuedate.dd=05;
	bookDb[*bookcount].issuedate.mm=11;
	bookDb[*bookcount].issuedate.yy=2024;
	printf("---- Book %d Added... ----\n", *bookcount+1);
	(*bookcount)++;

	bookDb[*bookcount].bookId = 143;
	strcpy(bookDb[*bookcount].bookName, "Earth");
	strcpy(bookDb[*bookcount].Authorname, "siya");
	strcpy(bookDb[*bookcount].Category, "fictional");
	bookDb[*bookcount].price = 550;
	bookDb[*bookcount].rating = 4;
	bookDb[*bookcount].issuedate.dd=00;
	bookDb[*bookcount].issuedate.mm=00;
	bookDb[*bookcount].issuedate.yy=00;
	printf("---- Book %d Added... ----\n", *bookcount+1);
	(*bookcount)++;
}

void top3books(Book* bookDb, int* bookcount, int sort1choice) {
	
	int i,j;
    if (*bookcount < 3) {
        printf("Not enough books to display top 3.\n");
        return;
    }

   
    Book tempDb[*bookcount];
    for (i = 0; i < *bookcount; i++) {
        tempDb[i] = bookDb[i];
    }

    for (i = 0; i < *bookcount - 1; i++) {
        for ( j = i + 1; j < *bookcount; j++) {
            if ((sort1choice == 1 && tempDb[i].price < tempDb[j].price) ||
                (sort1choice == 2 && tempDb[i].rating < tempDb[j].rating)) {
                Book temp = tempDb[i];
                tempDb[i] = tempDb[j];
                tempDb[j] = temp;
            }
        }
    }

    printf("\n--- Top 3 Books ---\n");
    for (i = 0; i < 3 && i < *bookcount; i++) {
        printf("\nId: %d", tempDb[i].bookId);
        printf("\nBook Name: %s", tempDb[i].bookName);
        printf("\nAuthor: %s", tempDb[i].Authorname);
        printf("\nCategory: %s", tempDb[i].Category);
        printf("\nPrice: %.2lf", tempDb[i].price);
        printf("\nRating: %f\n", tempDb[i].rating);
    }
}


void displayavailablebook(Book* bookDb,int bookcount) {

	int i,found =0;

	printf("\n---Available Books---");

	for(i=0; i<bookcount; i++) {

		if(bookDb[i].issuedate.dd==0 && bookDb[i].issuedate.mm ==0 && bookDb[i].issuedate.yy ==0) {

			printf("\nBook id:%d",bookDb[i].bookId);
			printf("\nBook name:%s",bookDb[i].bookName);
			printf("\nBook author name: %s",bookDb[i].Authorname);
			printf("\nBook category:%s",bookDb[i].Category);
			printf("\n Book price: %lf",bookDb[i].price);
			printf("\n Book rating :%f",bookDb[i].rating);
		}
		found =1;
	}

	if(found==0)
		printf("\n No Books are available");
}

void issuebook(Book *bookDb, int bookcount) {
    int i;
    int found = 0;
    int id;

    printf("Enter the Id of the Book you want to issue: ");
    scanf("%d", &id);
    	

    for (i = 0; i < bookcount; i++) {
        if (bookDb[i].bookId == id && bookDb[i].issuedate.dd == 0 &&
            bookDb[i].issuedate.mm == 0 && bookDb[i].issuedate.yy == 0) {
            
            printf("Enter the issue date of the book (DD MM YYYY): ");
            scanf("%d %d %d", &bookDb[i].issuedate.dd, &bookDb[i].issuedate.mm, &bookDb[i].issuedate.yy);
            
            printf("Book issued successfully.\n");
            
            found = 1;  
            break;  
        }
    }

    if (found == 0)
        printf("Book not available!\n");
}








