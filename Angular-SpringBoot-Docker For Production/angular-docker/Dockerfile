FROM node:14.15.5-alpine AS compile-image
WORKDIR /usr/app
COPY . ./

# stage 2
FROM nginx:alpine
COPY --from=compile-image /usr/app/dist/angular-docker /usr/share/nginx/html
COPY ./nginx.conf /etc/nginx/conf.d/default.conf
