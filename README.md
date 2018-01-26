# ratpack framework demo 
> include basic config && docker run

## build
```bash
./gradlew build
```

## docker build
```bash
docker build -t <imageName> .
```
## run with docker
```bash
docker run -d -p 5050:5050 <imageName>
```