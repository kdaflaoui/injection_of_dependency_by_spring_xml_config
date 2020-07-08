# injection_of_dependency_by_spring_xml_config -> XML Config

Le principe de l'injection de dependance ou inversison de controle est de diminuer le couplage fort afin de fermer l'application à la modification et de l'ouvrir à l'extention.

Diagramme de classes : 

![Dependency Injection](https://user-images.githubusercontent.com/26189475/86629026-c5a3c500-bf98-11ea-9590-59c919524195.jpg)

Injection de dependance est de charger dynamiquement en mémoire toutes les classes et leurs relations entre elles. 
Framework Spring permet de charger les classes du projet dans son container via une configuration XML ou Annotation. 
