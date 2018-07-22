FROM nginx:alpine
COPY index.html /usr/share/nginx/html
COPY health-check.json /usr/share/nginx/html